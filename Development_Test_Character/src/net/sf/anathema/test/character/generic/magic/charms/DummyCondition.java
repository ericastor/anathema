package net.sf.anathema.test.character.generic.magic.charms;

import net.sf.anathema.lib.gui.wizard.workflow.ICondition;

public class DummyCondition implements ICondition {

  private boolean value;

  @Override
  public boolean isFullfilled() {
    return value;
  }

  public void setValue(boolean value) {
    this.value = value;
  }

}
