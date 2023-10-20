package model;
import utils.formatTable;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n" +
                " ██████╗███████╗████████╗ █████╗ ██████╗          ██╗ █████╗ ██╗   ██╗ █████╗     \n" +
                "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗         ██║██╔══██╗██║   ██║██╔══██╗    \n" +
                "██║     ███████╗   ██║   ███████║██║  ██║         ██║███████║██║   ██║███████║    \n" +
                "██║     ╚════██║   ██║   ██╔══██║██║  ██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║    \n" +
                "╚██████╗███████║   ██║   ██║  ██║██████╔╝    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    \n" +
                " ╚═════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝      ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    \n" +
                "                                                                                  \n");
        Scanner input = new Scanner(System.in);
        List<Product> product = new ArrayList<>(){{
           add( new Product(1001,"Coca",3,1200,LocalDate.now()));
           add( new Product(1002,"Sting",4,2200,LocalDate.now()));
        }};
        Product Stock = new Product();
        String op;
        do {
            Table t = new Table(10, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE);
            t.addCell("* Display");
            t.addCell("W Write");
            t.addCell("R Read");
            t.addCell("U Update");
            t.addCell("D Delete");
            t.addCell("F First");
            t.addCell("P Previous");
            t.addCell("N Next");
            t.addCell("L Last");
            t.addCell("S Search");
            t.addCell("G Goto");
            t.addCell("Se Set row");
            t.addCell("H Help");
            t.addCell("E Exit");
            System.out.println(t.render());
            System.out.print("Command-->    :");
            op = input.next();
            switch (op) {
                case "*": {
                    System.out.println("================================================Information Stock===========================================");
                    formatTable.renderProduct(product);
                    Stock.page();
                    break;
                }
                case "H", "h": {
                    System.out.println("*".repeat(80));
                    System.out.println("!1. Press *: Display all recode of products");
                    System.out.println("!2. Press w: Add new Products");
                    System.out.println("!   Press W-->#proname-unit price+qty : shortcut for add new product ");
                    System.out.println("!3. Press r: read Content any Content");
                    System.out.println("!   Press r#proId :shortcut for read product by ID");
                    System.out.println("!4. Press u:Update Data");
                    System.out.println("!5. Press d:Delete data");
                    System.out.println("!   Press d#proId :shortcut for delete product by ID");
                    System.out.println("!6. Press f:Display first page");
                    System.out.println("!7. Press p:Display Previous page");
                    System.out.println("!8. Press n:Display next page");
                    System.out.println("!9. Press l:Display last page");
                    System.out.println("!10. Press s:Search Products by name");
                    System.out.println("!11. Press h:Help");
                    System.out.println("*".repeat(80));

                    break;
                }
                case "w", "W": {
                    Stock.input(input);
                    product.add(Stock);
                    System.out.println("You want recode this information of product");
                    System.out.print("Enter <y/Y> or <N/n> :? ");
                    input.nextLine();
                    String recode = input.nextLine();
                    if (recode.equals("y") || recode.equals("Y")) {
                        System.out.println("*".repeat(30));
                        System.out.println("Recode successfully");
                        System.out.println("*".repeat(30));
                    } else if (recode.equals("N") || recode.equals("n")) {
                        product.remove(Stock);
                        System.out.println("Thanks You!!");
                    } else {
                        System.out.println();
                        System.out.println("Invalid please read the construction");
                    }
                    break;
                }
                case "U", "u": {
                    int id, b = 0;
                    System.out.println("Enter ID Product for update=");
                    id = input.nextInt();
                    for (Product op1 : product) {
                        if (op1.getId() == id) {
                            b = 1;
                            Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
                            table.addCell("ID:" + op1.getId());
                            table.addCell("NAME:" + op1.getName());
                            table.addCell("QTY:" + op1.getQty());
                            table.addCell("PRICE:" + op1.getPrice());
                            table.addCell("TIME OF DATE:" + op1.getTime());
                            System.out.println(table.render());
                            System.out.println("What you want update?:");
                            formatTable.renderMenu();
                            int option;
                            do {
                                System.out.print("Enter option from(1-5):");
                                option = input.nextInt();
                                switch (option) {
                                    case 1: {
                                        System.out.print("Enter ID  of product=");
                                        int id3 = input.nextInt();
                                        System.out.print("Please enter new name=");
                                        input.nextLine();
                                        String name = input.nextLine();
                                        System.out.print("Enter new QTY of product=");
                                        int id2 = input.nextInt();
                                        System.out.print("Enter new Price of product=");
                                        float id1 = input.nextInt();
                                        op1.setPrice(id1);
                                        op1.setQty(id2);
                                        op1.setId(id3);
                                        op1.setName(name);
                                        System.out.println("Update successfully");
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("Please enter new name=");
                                        input.nextLine();
                                        String name = input.nextLine();
                                        op1.setName(name);
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("Enter new QTY of product=");
                                        int id2 = input.nextInt();
                                        op1.setQty(id2);
                                        break;
                                    }
                                    case 4: {
                                        System.out.print("Enter new Price of product=");
                                        float id1 = input.nextInt();
                                        op1.setPrice(id1);
                                        break;
                                    }
                                }
                            } while (option != 5);

                        }
                    }
                    if (b == 0) {
                        System.out.println("Invalid value");
                    }
                    break;
                }
                case "D", "d": {
                    int id, b = 0;
                    System.out.println("Enter ID Product for Delete=");
                    id = input.nextInt();
                    for (Product op1 : product) {
                        if (op1.getId() == id) {
                            b = 1;
                            Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
                            table.addCell("ID:          " + op1.getId());
                            table.addCell("NAME:        " + op1.getName());
                            table.addCell("QTY:         " + op1.getQty());
                            table.addCell("PRICE:       " + op1.getPrice());
                            table.addCell("TIME OF DATE:" + op1.getTime());
                            System.out.println(table.render());
                            System.out.println("Are You sure to delete this data");
                            System.out.print("Enter <yes> or <no>:");
                            input.nextLine();
                            String key = input.nextLine();
                            System.out.println();
                            if (key.equals("yes")) {
                                product.remove(op1);
                                System.out.println("*".repeat(30));
                                System.out.println("Delete successfully");
                                System.out.println("*".repeat(30));
                            } else if (key.equals("no")) {
                                System.out.println("Thanks You !!");
                            } else {
                                System.out.println("Invalid value please be sure !");
                            }
                        }
                    }

                    if (b == 0) {
                        System.out.println("Invalid value id of product !!");
                    }
                    break;
                }
                case "S", "s": {
                    int b = 0;
                    System.out.println("Enter name of product for search=");
                    input.nextLine();
                    String name = input.nextLine();
                    for (Product op1 : product) {
                        if (name.equals(op1.getName())) {
                            b = 1;
                            Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
                            table.addCell("ID:          " + op1.getId());
                            table.addCell("NAME:        " + op1.getName());
                            table.addCell("QTY:         " + op1.getQty());
                            table.addCell("PRICE:       " + op1.getPrice());
                            table.addCell("TIME OF DATE:" + op1.getTime());
                            System.out.println(table.render());
                        }
                    }
                    if (b == 0) {
                        System.out.println("Invalid value");
                    }
                    break;
                }
                case "R", "r": {
                    int b = 0;
                    int id;
                    do {
                        System.out.println("Read By ID of Product=");
                        id = input.nextInt();
                    } while (id <= 0);
                    for (Product op1 : product) {
                        if (id == op1.getId()) {
                            b = 1;
                            Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
                            table.addCell("ID:          " + op1.getId());
                            table.addCell("NAME:        " + op1.getName());
                            table.addCell("QTY:         " + op1.getQty());
                            table.addCell("PRICE:       " + op1.getPrice());
                            table.addCell("TIME OF DATE:" + op1.getTime());
                            System.out.println(table.render());
                        }
                    }
                    if (b == 0) {
                        System.out.println("Invalid value");
                    }
                    break;
                }
                case "L", "l": {
                    formatTable.menul(product);
                    Stock.page();
                   break;
                }
                case "F","f":{
                    formatTable.menuf(product);
                    Stock.lastpage();
                    break;
                }
                case "SE","se":{
                    System.out.println("Enter Number of row=");
                    int row=input.nextInt();
                    formatTable.Setrow(product,row);
                    Stock.page();
                    break;
                }
                case "G","g":{
                    System.out.println("Enter page u want visit=");
                    int page=input.nextInt();
                    Stock.gotopage(product,page);
                    break;
                }

            }
        } while (!op.equals("E")&&!op.equals("e"));
        System.out.println("Thanks you and give us an feedback");
    }
}