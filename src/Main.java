import java.util.ArrayList;
import java.util.HashMap;
// TODO: FIX LINE FOR PATH

public class Main {
    public enum GraphType{
        Scatter,
        Line,
        Column,
        draw,
        circle,
        PATH
    }
    public static HashMap<Integer, int[]> TimeToXY = new HashMap<Integer, int[]>();

    public static GraphType type = GraphType.PATH;
    private static ArrayList<Integer> x = new ArrayList<Integer>();
    private static ArrayList<Integer> y = new ArrayList<Integer>();
    static int intX = 1920/2;
    static int intY = 1080/2;
    static int Radios = 60;
    public static DrawFrame drawFrame;
    public static void main(String args[]){
        TimeToXY.put(0, new int[]{989, 597});
        TimeToXY.put(1, new int[]{1048, 424});
        TimeToXY.put(2, new int[]{1148, 477});
        TimeToXY.put(3, new int[]{1092, 630});
        TimeToXY.put(4, new int[]{1272, 758});
        TimeToXY.put(5, new int[]{1009, 204});
//        TimeToXY.put(6, new int[]{1331, 651});
//        TimeToXY.put(7, new int[]{1428, 704});
//        TimeToXY.put(8, new int[]{775, 44});
//        TimeToXY.put(9, new int[]{1101, 121});
//        TimeToXY.put(10, new int[]{913, 651});
//        TimeToXY.put(11, new int[]{879, 723});
//        TimeToXY.put(12, new int[]{1506, 497});
//        TimeToXY.put(13, new int[]{1592, 351});
//        TimeToXY.put(14, new int[]{716, 771});
//        TimeToXY.put(15, new int[]{303, 614});
//        TimeToXY.put(16, new int[]{677, 545});
//        TimeToXY.put(17, new int[]{491, 168});
//        TimeToXY.put(18, new int[]{895, 668});
//        TimeToXY.put(19, new int[]{823, 424});
//        TimeToXY.put(20, new int[]{1165, 803});
//        TimeToXY.put(21, new int[]{1641, 342});
//        TimeToXY.put(22, new int[]{531, 661});
//        TimeToXY.put(23, new int[]{129, 370});
//        TimeToXY.put(24, new int[]{591, 654});
//        TimeToXY.put(25, new int[]{1055, 883});
//        TimeToXY.put(26, new int[]{1504, 254});
//        TimeToXY.put(27, new int[]{485, 827});
//        TimeToXY.put(28, new int[]{180, 294});
//        TimeToXY.put(29, new int[]{1150, 824});
//        TimeToXY.put(30, new int[]{1123, 220});
//        TimeToXY.put(31, new int[]{230, 746});
//        TimeToXY.put(32, new int[]{777, 561});
//        TimeToXY.put(33, new int[]{1683, 416});
//        TimeToXY.put(34, new int[]{234, 748});
//        TimeToXY.put(35, new int[]{1067, 853});
//        TimeToXY.put(36, new int[]{1623, 825});
//        TimeToXY.put(37, new int[]{1356, 554});
//        TimeToXY.put(38, new int[]{1014, 297});
//        TimeToXY.put(39, new int[]{716, 395});
//        TimeToXY.put(40, new int[]{255, 424});
//        TimeToXY.put(41, new int[]{210, 357});
//        TimeToXY.put(42, new int[]{414, 229});
//        TimeToXY.put(43, new int[]{71, 279});
//        TimeToXY.put(44, new int[]{589, 163});
//        TimeToXY.put(45, new int[]{589, 163});
//        TimeToXY.put(46, new int[]{589, 163});
//        TimeToXY.put(47, new int[]{589, 163});
//        TimeToXY.put(48, new int[]{589, 163});
//        TimeToXY.put(49, new int[]{1083, 478});
//        TimeToXY.put(50, new int[]{245, 547});
//        TimeToXY.put(51, new int[]{0, 512});
//        TimeToXY.put(52, new int[]{1155, 436});
//        TimeToXY.put(53, new int[]{273, 536});
//        TimeToXY.put(54, new int[]{1209, 384});
//        TimeToXY.put(55, new int[]{687, 399});
//        TimeToXY.put(56, new int[]{461, 353});
//        TimeToXY.put(57, new int[]{403, 779});
//        TimeToXY.put(58, new int[]{765, 860});
//        TimeToXY.put(59, new int[]{940, 1075});
//        TimeToXY.put(60, new int[]{640, 890});
//        TimeToXY.put(61, new int[]{640, 670});
//        TimeToXY.put(62, new int[]{826, 718});
//        TimeToXY.put(63, new int[]{1092, 617});
//        TimeToXY.put(64, new int[]{1184, 215});
//        TimeToXY.put(65, new int[]{507, 450});
//        TimeToXY.put(66, new int[]{686, 1055});
//        TimeToXY.put(67, new int[]{1112, 470});
//        TimeToXY.put(68, new int[]{777, 972});
//        TimeToXY.put(69, new int[]{473, 484});
//        TimeToXY.put(70, new int[]{658, 474});
//        TimeToXY.put(71, new int[]{299, 746});
//        TimeToXY.put(72, new int[]{1046, 273});
//        TimeToXY.put(73, new int[]{274, 434});
//        TimeToXY.put(74, new int[]{577, 250});
//        TimeToXY.put(75, new int[]{1596, 179});
//        TimeToXY.put(76, new int[]{1919, 362});
//        TimeToXY.put(77, new int[]{1694, 491});
//        TimeToXY.put(78, new int[]{1396, 432});
//        TimeToXY.put(79, new int[]{612, 644});
//        TimeToXY.put(80, new int[]{489, 569});
//        TimeToXY.put(81, new int[]{667, 421});
//        TimeToXY.put(82, new int[]{511, 746});
//        TimeToXY.put(83, new int[]{1317, 408});
//        TimeToXY.put(84, new int[]{1057, 322});
//        TimeToXY.put(85, new int[]{853, 257});
//        TimeToXY.put(86, new int[]{293, 835});
//        TimeToXY.put(87, new int[]{1084, 851});
//        TimeToXY.put(88, new int[]{858, 347});
//        TimeToXY.put(89, new int[]{1214, 921});
//        TimeToXY.put(90, new int[]{1017, 579});
//        TimeToXY.put(91, new int[]{314, 783});
//        TimeToXY.put(92, new int[]{806, 311});
//        TimeToXY.put(93, new int[]{735, 877});
//        TimeToXY.put(94, new int[]{402, 76});
//        TimeToXY.put(95, new int[]{261, 133});
//        TimeToXY.put(96, new int[]{852, 170});
//        TimeToXY.put(97, new int[]{666, 841});
//        TimeToXY.put(98, new int[]{196, 513});
//        TimeToXY.put(99, new int[]{887, 200});

            for(int i = 0; i<50; i++){
                x.add(i);
                y.add((i-25)*(i-25));
            }
            new DrawFrame(type, TimeToXY);

    }
}