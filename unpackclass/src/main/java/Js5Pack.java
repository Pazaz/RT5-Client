import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!p")
public final class Js5Pack extends Js5 {

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZ)V")
	public Js5Pack(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) throws IOException {
		this(arg0, arg1, arg2, false);
	}

	@OriginalMember(owner = "unpackclass!p", name = "<init>", descriptor = "([BZZZ)V")
	private Js5Pack(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) throws IOException {
		super(arg1, arg2);
		this.read(new DataInputStream(new ByteArrayInputStream(arg0)), arg3);
	}

	@OriginalMember(owner = "unpackclass!p", name = "a", descriptor = "(Ljava/io/DataInputStream;Z)V")
	private void read(@OriginalArg(0) DataInputStream in, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(4) int indexType = in.read();
		@Pc(7) int indexRemaining = in.readInt();
		@Pc(9) int indexCompressedLen = indexRemaining;
		if (indexType != 0) {
			indexRemaining += 4;
		}
		@Pc(19) Buffer indexBuffer = new Buffer(indexRemaining + 5);
		indexBuffer.p1(indexType);
		indexBuffer.p4(indexCompressedLen);
		in.readFully(indexBuffer.data, indexBuffer.pos, indexRemaining);
		this.decode(indexBuffer.data);
		for (@Pc(38) int i = 0; i < super.size; i++) {
			indexType = in.read();
			indexRemaining = in.readInt();
			indexCompressedLen = indexRemaining;
			if (indexType != 0) {
				indexRemaining += 4;
			}
			indexBuffer = new Buffer(indexRemaining + 5);
			indexBuffer.p1(indexType);
			indexBuffer.p4(indexCompressedLen);
			while (indexRemaining > 0x2000000) {
				in.readFully(indexBuffer.data, indexBuffer.pos, 0x2000000);
				indexBuffer.pos += 0x2000000;
				indexRemaining -= 0x2000000;
			}
			in.readFully(indexBuffer.data, indexBuffer.pos, indexRemaining);
			if (super.discardPacked) {
				super.packed[super.groupIds[i]] = indexBuffer.data;
			} else {
				super.packed[super.groupIds[i]] = ByteArray.wrap(indexBuffer.data);
			}
		}
	}
}
