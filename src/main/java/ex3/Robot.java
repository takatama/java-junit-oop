package ex3;

public class Robot {
    /**
     * 箱の種類に応じて、箱の開け方を返却する
     * @param boxType　箱の種類
     * @return　箱の開け方
     */
    public String openBox(String boxType) {
        if (boxType.equals("PlainBox")) {
            return "そのまま開けます";
        } else if (boxType.equals("RibbonedBox")) {
            return "リボンをほどいて、箱を開けます";
        } else if (boxType.equals("LockedBox")) {
            return "開錠して、箱を開けます";
        }
        return "開け方が分かりません";
    }

    /**
     * 箱の種類に応じて、箱の開け方を返却する
     * @param box 箱
     * @return　箱の開け方
     */
    public String openBox(Box box) {
        return null;
    }
}

