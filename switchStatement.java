public class switchStatement {
    public static void main(String[] args) {
        char grade='C';
        switch(grade)
        {
            case 'A':
            System.out.println("excellent");
             break;
            case 'B':
            System.out.println("Great");
            break;
            case 'C':
            System.out.println("Good");
            break;
            case 'D':
            System.out.println("well done");
            break;
            default:
            System.out.println("invalid grade");
        }

    }
}
