package string_numbers_tdd;

public class StringWithNumbers {

    //fields
    private String string;

    public StringWithNumbers(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }


    //123 456 987 333
    public int sumOfNumbersInStringTest (String string){
        int sum = 0;
        String[] numbers = string.split(" "); //split метод класса стринг, если в строке есть пробелы и помещает кусочки в массив
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;
    }

    //methods
}
