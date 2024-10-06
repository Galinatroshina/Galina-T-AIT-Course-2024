package homework;

public class Kolobok {

    public static void main(String[] args) {
        System.out.println("Жили-Были дед да бабка. Однажды бабка испекла колобок и поставила его остужаться на окне.");
        koloboktravel(); // поход колобка
        System.out.println("Тут и сказочке конец!");

    } //end of main

    public static void koloboktravel(){
        System.out.println("Колобок сбежал и покатился по дорожке");

        hare(); // встретил зайца
        wolf(); //встретил волка
        bear(); //встретил медведя
        fox(); // встретил лису

    }

    public static void hare(){
        System.out.println("Повстречал колобок зайца.");
        System.out.println("Заяц говорит: Колобок-Колобок, я тебя съем!");
        System.out.println("Колобок отвечает: Не ешь меня! Давай я тебе песенку спою!");
        System.out.println("Колобок поет свою песню и убегает от зайца.");
    }

    public static void wolf(){
        System.out.println("Колобок встречает на своем пути волка.");
        System.out.println("Волк говорит: Колобок-колобок, а я тебя съем!");
        System.out.println("Колобок отвеает: Ой, не ешь меня серый волк, я тебе песенку спою!");
        System.out.println("Колобок поет песенку и потом убегает от волка.");
    }

    public static void bear(){
        System.out.println("Колобок встречает медведя.");
        System.out.println("Медведь говорит: Колобок, я тебя съем!");
        System.out.println("Колобок отвечает: Не ешь меня, Мишка, лучше я тебе песенку спою!");
        System.out.println("Колобок снова поет свою песенку и успешно сбегает от медведя.");
    }

    public static void fox(){
        System.out.println("Внезапно колобок встречает хитрую лисицу.");
        System.out.println("Лиса говорит колобку: какой ты замечательный, Колобок, может ты еще и песенки петь умеешь?");
        System.out.println("Колобок весело отвечает: да, я умею! И поет свою песенку.");
        System.out.println("Колобок допел песню, но тут лиса говорит: Я тебя почти не слышу, не мог бы ты сесть ко мне на нос и спеть еще раз?");
        System.out.println("Колобок прыгает к лисе на нос и начинает петь песенку...");
        System.out.println("Лиса тут же съедает колобка.");
    }



} //end of class
