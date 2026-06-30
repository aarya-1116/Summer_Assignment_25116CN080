import java.util.Scanner;
public class menudrivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("\n----- String Operations -----");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Count Vowels");
            System.out.println("9. Replace Character");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    System.out.println("String stored successfully.");
                    break;
                case 2:
                    if (str.isEmpty())
                        System.out.println("No string entered.");
                    else
                        System.out.println("String: " + str);
                    break;
                case 3:
                    if (str.isEmpty())
                        System.out.println("No string entered.");
                    else
                        System.out.println("Length: " + str.length());
                    break;
                case 4:
                    if (str.isEmpty())
                        System.out.println("No string entered.");
                    else
                        System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 5:
                    if (str.isEmpty())
                        System.out.println("No string entered.");
                    else
                        System.out.println("Lowercase: " + str.toLowerCase());
                    break;
                case 6:
                    if (str.isEmpty()) {
                        System.out.println("No string entered.");
                    } else {
                        String rev = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            rev += str.charAt(i);
                        }
                        System.out.println("Reversed String: " + rev);
                    }
                    break;
                case 7:
                    if (str.isEmpty()) {
                        System.out.println("No string entered.");
                    } else {
                        String rev = "";
                        for (int i = str.length() - 1; i >= 0; i--) {
                            rev += str.charAt(i);
                        }

                        if (str.equalsIgnoreCase(rev))
                            System.out.println("Palindrome");
                        else
                            System.out.println("Not a Palindrome");
                    }
                    break;
                case 8:
                    if (str.isEmpty()) {
                        System.out.println("No string entered.");
                    } else {
                        int count = 0;
                        for (int i = 0; i < str.length(); i++) {
                            char ch = Character.toLowerCase(str.charAt(i));
                            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                                ch == 'o' || ch == 'u') {
                                count++;
                            }
                        }
                        System.out.println("Number of vowels: " + count);
                    }
                    break;
                case 9:
                    if (str.isEmpty()) {
                        System.out.println("No string entered.");
                    } else {
                        System.out.print("Enter character to replace: ");
                        char oldChar = sc.next().charAt(0);
                        System.out.print("Enter new character: ");
                        char newChar = sc.next().charAt(0);
                        str = str.replace(oldChar, newChar);
                        System.out.println("Updated String: " + str);
                    }
                    break;
                case 10:
                    System.out.println("Thank you for using the program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}