package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DDISPLAYMODE")
public final class D3DDISPLAYMODE {

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Width", descriptor = "I")
	private int Width;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Height", descriptor = "I")
	private int Height;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "Format", descriptor = "I")
	public int Format;

	@OriginalMember(owner = "client!jagdx/D3DDISPLAYMODE", name = "RefreshRate", descriptor = "I")
	private int RefreshRate;
}
