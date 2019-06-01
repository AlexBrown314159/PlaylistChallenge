package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

/*
        System.out.println(startIndex);
        System.out.println(selection);
        for (Integer i = 0; i < playList.length; i++) {
            System.out.println(playList[i].toString());
        }
*/
        String[] myPlayList = new String[3 * playList.length];
        for (Integer i = 0; i < playList.length; i++) {
            myPlayList[i] = playList[i];
            myPlayList[i + playList.length] = playList[i];
            myPlayList[i + playList.length + playList.length] = playList[i];
        }
//        System.out.println(myPlayList.length);

//        for (Integer i = 0; i < myPlayList.length; i++) {
//            System.out.println(myPlayList[i]);
//        }


        Integer iForward = 0;
        Integer iBackward = 0;
        Integer iMin = 0;
        Integer iLen =playList.length;
        Integer iStart = startIndex + iLen;


        for (Integer i = iStart; i < myPlayList.length; i++) {
            if (myPlayList[i].equals(selection)) {
                iForward = Math.abs(iStart - i);
                break;
            }
    }

//        System.out.println("iForward = " + iForward);

        for (Integer i = iStart; i >= 0 ; i--) {
            if (myPlayList[i].equals(selection)) {
                iBackward = Math.abs(iStart - i);
                break;
            }
        }

//        System.out.println("iBackward = " + iBackward);

        iMin = Math.min(iForward, iBackward);

//        System.out.println(iMin);

        return iMin;
    }
}
