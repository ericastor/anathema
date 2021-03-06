package net.sf.anathema.character.ghost.age;

import net.sf.anathema.character.generic.additionaltemplate.AbstractAdditionalModelAdapter;
import net.sf.anathema.character.generic.additionaltemplate.AdditionalModelType;
import net.sf.anathema.character.generic.additionaltemplate.IAdditionalModelBonusPointCalculator;
import net.sf.anathema.character.generic.framework.additionaltemplate.model.ICharacterModelContext;
import net.sf.anathema.lib.control.change.ChangeControl;
import net.sf.anathema.lib.control.change.IChangeListener;

public class GhostAgeModel extends AbstractAdditionalModelAdapter
{
  private final ChangeControl control = new ChangeControl();
  private final ICharacterModelContext context;
  private final GhostAgeTemplate template;

  public AdditionalModelType getAdditionalModelType() {
    return AdditionalModelType.Miscellaneous;
  }

  public GhostAgeModel(
	  GhostAgeTemplate template,
      final ICharacterModelContext context) {
    this.context = context;
    this.template = template;
  }
  
  public String getTemplateId()
  {
	  return template.getId();
  }
  
  public IAdditionalModelBonusPointCalculator getBonusPointCalculator()
  {
	return new AgeModelBonusPointCalculator(context);
  }  
 
	@Override
	public void addChangeListener(IChangeListener listener) {
		control.addChangeListener(listener);
		
	}
}