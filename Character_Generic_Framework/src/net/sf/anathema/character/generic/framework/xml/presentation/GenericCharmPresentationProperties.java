package net.sf.anathema.character.generic.framework.xml.presentation;

import java.awt.Dimension;

import net.sf.anathema.lib.lang.clone.ReflectionCloneableObject;
import net.sf.anathema.platform.svgtree.document.visualizer.ITreePresentationProperties;

public class GenericCharmPresentationProperties extends ReflectionCloneableObject<GenericCharmPresentationProperties> implements
    ITreePresentationProperties {

  private String polygonString;
  private Dimension charmDimension;
  private Dimension gapDimension;
  private Dimension lineDimension;
  private boolean isolateSingles = false;

  public String getNodeFramePolygonString() {
    return polygonString;
  }

  public Dimension getNodeDimension() {
    return charmDimension;
  }

  public Dimension getGapDimension() {
    return gapDimension;
  }
  
  public Dimension getVerticalLineDimension() {
    return lineDimension;
  }

  public boolean isolateSingles() {
    return isolateSingles;
  }

  public void setPolygonString(String polygonString) {
    this.polygonString = polygonString;
  }

  public void setCharmDimension(Dimension dimension) {
    this.charmDimension = dimension;
  }

  public void setGapDimension(Dimension dimension) {
    this.gapDimension = dimension;
  }
  
  public void setVerticalLineDimension(Dimension dimension) {
    this.lineDimension = dimension;
  }

  public void setIsolateSingles(boolean isolate) {
    this.isolateSingles = isolate;
  }
}