package net.sf.anathema.character.model;

import net.sf.anathema.character.generic.caste.ITypedDescriptionType;
import net.sf.anathema.lib.control.change.IChangeListener;

public interface ITypedDescription<T extends ITypedDescriptionType> {

  public T getType();

  public void setType(T type);

  public void addChangeListener(IChangeListener listener);
}