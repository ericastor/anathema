package net.sf.anathema.character.reporting.sheet.common.anima;

import net.sf.anathema.character.reporting.sheet.common.IPdfContentBoxEncoder;
import net.sf.anathema.character.reporting.sheet.page.IPdfPartEncoder;
import net.sf.anathema.character.reporting.sheet.util.IPdfTableEncoder;
import net.sf.anathema.lib.resources.IResources;

import com.lowagie.text.pdf.BaseFont;

public abstract class AbstractAnimaEncoderFactory implements IAnimaEncoderFactory {

  private final IResources resources;
  private final BaseFont symbolBaseFont;
  private final BaseFont basefont;

  public AbstractAnimaEncoderFactory(IResources resources, BaseFont basefont, BaseFont symbolBaseFont) {
    this.resources = resources;
    this.basefont = basefont;
    this.symbolBaseFont = symbolBaseFont;
  }

  @Override
  public final IPdfContentBoxEncoder createAnimaEncoder() {
    return new PdfAnimaEncoder(
        resources,
        basefont,
        symbolBaseFont,
        IPdfPartEncoder.FONT_SIZE,
        getAnimaTableEncoder());
  }

  protected abstract IPdfTableEncoder getAnimaTableEncoder();

  protected final float getFontSize() {
    return IPdfPartEncoder.FONT_SIZE;
  }

  protected final BaseFont getBaseFont() {
    return basefont;
  }

  protected final IResources getResources() {
    return resources;
  }

  protected final BaseFont getSymbolBaseFont() {
    return symbolBaseFont;
  }
}