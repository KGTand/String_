public class String_ {
    public static void main(String[] args) {
       String text = "Privet, kak dela?";
       String text2 = new String(text);
       String text3 = "Privet";
       System.out.println("text содержит текст: " + text);
       System.out.println("text2 содержит текст: " + text2);
       System.out.println("text3 содержит текст: " + text3);
       int result;
       int idx;
       int i;
       
        System.out.println("Длинна строки text: " + text.length());
        
        System.out.println("Длинна строки text2: " + text2.length());
        
        System.out.println("Длинна строки text3: " + text3.length());
        
        System.out.print("разница в количестве символов между text и text3: ");
        System.out.println(text.compareTo(text3));
            System.out.println("по - символьно для text: ");
            for(i = 0; i < text.length();i++){
                System.out.print(text.charAt(i));            
            }
        System.out.println();
        
        if(text.equals(text2)){
            System.out.println("text и text2 эквиваленты");
        } else{
            System.out.println("text и text2 не эквиваленты");
        }
        if(text.equals(text3)){
            System.out.println("text и text3 эквиваленты");
        } else{
            System.out.println("text и text3 не эквиваленты");
        }
        
        result = text.compareTo(text3);
        if(result == 0){
            System.out.println("text и text3 равны");
        } else if (result < 0 ){
            System.out.println("text меньше чем text3");
        } else {
            System.out.println("text больше чем text3");
        }
        System.out.println();
        
        text2 = "one two three one two one three two one";
        System.out.println("text2 теперь содержит текст: " + text2);
        
        idx = text2.indexOf("two");
        System.out.println("индекс первого вхождения 'two' в text2 равен:  " + text2.indexOf("two"));
        idx = text2.lastIndexOf("two");
        System.out.println("индекс последнего вхождения 'two' в text2 равен:  " + idx);
        System.out.println();
        
        String num[] = {"one", "two", "three", "for"};
        System.out.print("массив num: ");
        for(String s: num){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("Количество слов в массиве num: ");
        System.out.println(num.length);
        num[3] = "GO";
        System.out.print("массив num после изменения последнего слова: ");
            for(String s: num){
                System.out.print(s + " ");
            }
        System.out.println();
        String text4 = text.substring(8,11);
        System.out.println(text4);
    } 
}
