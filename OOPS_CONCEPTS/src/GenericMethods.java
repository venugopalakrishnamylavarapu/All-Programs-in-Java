public class GenericMethods {
    //Generic antey --> manam okavela anni reference data types(wrapperclasses) okka sarey access cheyalantey adi e generic method dwara avuthai
    //so,basic ga emavuthundantey manam oka class ni gani oka interface ni gani declare cheystam andulo anni Reference data typess add cheystam
    //use enti? -->use entanteey manam prathi sari oka kotta method ni create cheyakarla-"okka sari generic class pettu enni data types ina kottu"-
    public static void main(String[] args) {
        Integer[] intArray={1,2,4,5,8,7};
        Double[] doubleArray={1.57,5.6,9.68,54.57};
        Character[] charArray={'s','u','b','s','c','r','i','b','e'};
        String[] stringArray={"Gamester","Gaming(FF,Fortnite,pubg,coc etc)","channel"};

        ArrayDisplay(intArray);
        ArrayDisplay(doubleArray);          //Anta generic method mahima-->Single class anni references tiskundi choosaru ga
        ArrayDisplay(charArray);
        ArrayDisplay(stringArray);



//        IntegerArrayDisplay(intArray);
//        CharacterArrayDisplay(charArray);

        //so ikkada manam choosinattithey manam 2 seperate methods create cheysam time waste,space waste
    }
//    public static void IntegerArrayDisplay(Integer[] array)     //idey oka  generic methods create cheysi vadithey annitiki okka method vadochu
//    {
//        for (Integer x: array) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//    public static void CharacterArrayDisplay(Character[] array)
//    {
//        for (Character x: array) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }

    //so Generic method antey em ledu mowa method declaration lo <T> ani symbol pedithey chalu adi generic method(t place lo emmana undochu mitrama)
    public static  <V> void ArrayDisplay(V[] array)     //nenu v set cheysa
    {
        for (V value: array) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
