package net.sf.anathema.framework.module.preferences;

import static net.sf.anathema.framework.presenter.action.preferences.IAnathemaPreferencesConstants.LOOK_AND_FEEL_PREFERENCE;
import net.sf.anathema.lib.control.WindowsUtilities;
import net.sf.anathema.lib.gui.gridlayout.IGridDialogPanel;
import net.sf.anathema.lib.resources.IResources;
import net.sf.anathema.lib.util.IIdentificate;

public class LookAndFeelPreferencesElement extends AbstractCheckBoxPreferencesElement {
  private boolean useMetal = SYSTEM_PREFERENCES.getBoolean(LOOK_AND_FEEL_PREFERENCE, false);

  @Override
  public void addCompoment(IGridDialogPanel panel, IResources resources) {
    if (WindowsUtilities.isWindows()) {
      super.addCompoment(panel, resources);
    }
  }

  public void savePreferences() {
    SYSTEM_PREFERENCES.putBoolean(LOOK_AND_FEEL_PREFERENCE, useMetal);
  }

  @Override
  protected boolean getBooleanParameter() {
    return useMetal;
  }

  @Override
  protected void setValue(boolean value) {
    useMetal = value;
  }

  @Override
  protected String getLabelKey() {
    return "AnathemaCore.Tools.Preferences.LookFeel"; //$NON-NLS-1$
  }

  @Override
  protected void resetValue() {
    useMetal = SYSTEM_PREFERENCES.getBoolean(LOOK_AND_FEEL_PREFERENCE, false);
  }

  public IIdentificate getCategory() {
    return SYSTEM_CATEGORY;
  }
}