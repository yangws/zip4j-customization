package net.lingala.customzip4j.io.outputstream;

import java.io.IOException;

public interface OutputStreamWithSplitZipSupport {

  long getFilePointer() throws IOException;

  int getCurrentSplitFileCounter();
}
