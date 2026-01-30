import java.util.Scanner;

//problem3
// void main(String[] args) {
//    double width = 4.5;
//    double height = 7.9;
//    double area = width * height;
//    double perimeter = 2 * (width + height);
//
//    System.out.println("The area of the rectangle is: " + area);
//    System.out.println("The perimeter of the rectangle is: " + perimeter);
//}


//problem4
//void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter the radius and length of a cylinder: ");
//    double radius= input.nextDouble();
//    double length= input.nextDouble();
//    double area = radius * radius * Math.PI;
//    double volume = area * length;
//    System.out.printf("The area is %.4f%n", area);
//    System.out.printf("The volume is %.1f%n", volume);
//    input.close();
//}

//problem5
// void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter length of the sides and height of the Equilateral triangle:");
//        double side = input.nextDouble();
//        double length = input.nextDouble();
//        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
//        double volume = area * length;
//        System.out.printf("The area is %.2f%n", area);
//        System.out.printf("The volume of the Triangular prism is %.2f%n", volume);
//    }

//problem6
//void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    final double TAX_RATE = 0.07;
//    final double TIP_RATE = 0.18;
//    System.out.print("Enter the cost of the meal: ");
//    double mealCost = input.nextDouble();
//    double taxAmount = mealCost * TAX_RATE;
//    double tipAmount = mealCost * TIP_RATE;
//    double grandTotal = mealCost + taxAmount + tipAmount;
//
//    System.out.printf("Tax amount:    $%.2f%n", taxAmount);
//    System.out.printf("Tip amount:    $%.2f%n", tipAmount);
//    System.out.printf("Grand total:   $%.2f%n", grandTotal);
// }

//problem7
//void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter the driving distance: ");
//    double distance = input.nextDouble();
//    System.out.print("Enter miles per gallon: ");
//    double mpg = input.nextDouble();
//    System.out.print("Enter price per gallon: ");
//    double price = input.nextDouble();
//    double totalCost = (distance / mpg) * price;
//    System.out.printf("The cost of driving is $%.2f%n", totalCost);
//}

//problem8
//void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter a four-digit integer: ");
//    int number = input.nextInt();
//    int d1 = number / 1000;
//    int d2 = (number / 100) % 10;
//    int d3 = (number / 10) % 10;
//    int d4 = number % 10;
//    int sum = d1 + d2 + d3 + d4;
//    System.out.printf("%d+%d+%d+%d=%d%n", d1, d2, d3, d4, sum);
//}

//problem9
void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three integers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b, c));
    int middle = (a + b + c) - smallest - largest;
    System.out.println("The sorted order is: " + smallest + " " + middle + " " + largest);
}






