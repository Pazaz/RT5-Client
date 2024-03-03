import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ByteArrayPool {
    @OriginalMember(owner = "client!qk", name = "gb", descriptor = "[[B")
    public static final byte[][] allocatedMin = new byte[1000][];
    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[[B")
    public static final byte[][] allocatedMid = new byte[250][];
    @OriginalMember(owner = "client!od", name = "bb", descriptor = "[[B")
    public static final byte[][] allocatedMax = new byte[50][];
    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int allocatedMinCount = 0;
    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int allocatedMidCount = 0;
    @OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
    public static int allocatedMaxCount = 0;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[B")
    public static synchronized byte[] alloc(@OriginalArg(0) int size) {
        @Pc(19) byte[] data;

        if (size == 100 && allocatedMinCount > 0) {
            data = allocatedMin[--allocatedMinCount];
            allocatedMin[allocatedMinCount] = null;
            return data;
        } else if (size == 5000 && allocatedMidCount > 0) {
            data = allocatedMid[--allocatedMidCount];
            allocatedMid[allocatedMidCount] = null;
            return data;
        } else if (size == 30000 && allocatedMaxCount > 0) {
            data = allocatedMax[--allocatedMaxCount];
            allocatedMax[allocatedMaxCount] = null;
            return data;
        }

        return new byte[size];
    }
}
