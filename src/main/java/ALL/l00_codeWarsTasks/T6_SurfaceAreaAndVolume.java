package ALL.l00_codeWarsTasks;

public class T6_SurfaceAreaAndVolume {
    public static int[] getSize(int w,int h,int d) {
        return new int[] {w*h*2+w*d*2+h*d*2, w*h*d};
    }
}
