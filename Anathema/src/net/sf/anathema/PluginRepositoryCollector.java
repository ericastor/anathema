package net.sf.anathema;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;

public class PluginRepositoryCollector {
  private final StringBuilder builder = new StringBuilder();

  public String getPluginRepositories() throws IOException, MalformedURLException {
    addLaunchDirectory();
    addPluginsFolder();
    addClassPath();
    return allLocations();
  }

  private void addLaunchDirectory() throws MalformedURLException {
    addResource(getFilePath(".")); //$NON-NLS-1$
  }

  private void addPluginsFolder() throws MalformedURLException {
    addResource(getFilePath("./plugins"));
  }

  private void addClassPath() throws IOException {
    Enumeration<URL> systemResources = ClassLoader.getSystemResources("."); //$NON-NLS-1$
    while (systemResources.hasMoreElements()) {
      addResource(systemResources.nextElement().getPath());
    }
  }

  private String allLocations() {
    return builder.toString();
  }

  private void addResource(String resource) {
    addSeparatorIfNecessary();
    if (resource.equals("/")) {
      return;
    }
    builder.append(resource);
  }

  private void addSeparatorIfNecessary() {
    if (!builder.toString().endsWith(",")) {
      builder.append(",");
    }
  }

  private String getFilePath(String string) throws MalformedURLException {
    return new File(string).toURI().toURL().getPath();
  }
}