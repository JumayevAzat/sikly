public class Homework2  {

    public static void main(String[] args) {
        int count = 1;
        int a = 8;
        if (a % 7 == 0) {
            System.out.println("Yes this number is divisible by 7");
        } else {
            {
                System.out.println("This number is not divisible by 7");

            }
	/* do
	    {System.out.print("count:" + count + ", number:");
		System.out.println(count * 7);
	    }
	while (++count<16); */

            for (count = 1; count < 16; ++count) {
                System.out.println("count:" + count + ", number:" + count * 7);
            }
        }
    }
}

