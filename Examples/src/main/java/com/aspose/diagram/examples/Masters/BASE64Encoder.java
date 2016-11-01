package com.aspose.diagram.examples.Masters;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;

public class BASE64Encoder {
	private final static char map[] = { // 0 1 2 3 4 5 6 7
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', // 0
			'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', // 1
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', // 2
			'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', // 3
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', // 4
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', // 5
			'w', 'x', 'y', 'z', '0', '1', '2', '3', // 6
			'4', '5', '6', '7', '8', '9', '+', '/' // 7
	};

	private final String lineSeparator;
	private final boolean splitLines;

	public BASE64Encoder() {
		lineSeparator = System.getProperty("line.separator");
		splitLines = true;
	}

	final void encodeBuffer(final InputStream inStream, final Writer outStream) throws IOException {
		final byte[] tmpbuffer = new byte[57];
		while (true) {
			final int numBytes = readFully(inStream, tmpbuffer);
			if (numBytes == -1) {
				break;
			}
			for (int j = 0; j < numBytes; j += 3) {
				if ((j + 3) <= numBytes) {
					encodeAtom(outStream, tmpbuffer, j, 3);
				} else {
					encodeAtom(outStream, tmpbuffer, j, (numBytes) - j);
				}
			}
			if (splitLines) {
				outStream.write(lineSeparator);
			}
			if (numBytes < 57) {
				break;
			}
		}
	}

	public final String encodeBuffer(final byte[] aBuffer) {
		final StringWriter outStream = new StringWriter();// aBuffer.length +
															// aBuffer.length>>1);
		try {
			encodeBuffer(new ByteArrayInputStream(aBuffer), outStream);
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return outStream.toString();
	}

	final void encodeAtom(final Writer outStream, final byte[] data, final int offset, final int len) throws IOException {
		final byte a;
		final byte b;
		final byte c;

		if (len == 1) {
			a = data[offset];
			b = 0;
			c = 0;
			outStream.write(map[(a >>> 2) & 0x3F]);
			outStream.write(map[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
			outStream.write('=');
			outStream.write('=');
		} else if (len == 2) {
			a = data[offset];
			b = data[offset + 1];
			c = 0;
			outStream.write(map[(a >>> 2) & 0x3F]);
			outStream.write(map[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
			outStream.write(map[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)]);
			outStream.write('=');
		} else {
			a = data[offset];
			b = data[offset + 1];
			c = data[offset + 2];
			outStream.write(map[(a >>> 2) & 0x3F]);
			outStream.write(map[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
			outStream.write(map[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)]);
			outStream.write(map[c & 0x3F]);
		}
	}

	private final int readFully(final InputStream in, final byte[] buffer) throws IOException {
		final int len = buffer.length;
		for (int i = 0; i < len; i++) {
			final int q = in.read();
			if (q == -1) {
				return i;
			}
			buffer[i] = (byte) q;
		}
		return len;
	}
}
