package talks.mjc.module4_1.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if(symbol == 'E' || symbol == 'N' || symbol == 'G')
            System.out.println("English");
        else
            System.out.println("Non English");
    }
}
