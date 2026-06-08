package poly.ex1;

public class AnimalSoundMain {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //Cow[] cowArr =  {dog, cat, cow}; //배열 사용해서 반복문 처리하려고 해도 타입이 달라서 넣을 수가 없음

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCow(cow);

        soundCat(cat);
    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundCat(Cat cat) {
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
