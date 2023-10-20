package model;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Product{
private int id;
private  String name;
private int qty;
private float price;
private LocalDate time;
public  Product(){}

public Product(int id, String name, int qty, float price,LocalDate time) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.time=time;
        }
        int j=2;
        public void input(Scanner input)
        {
                System.out.print("Enter Product Id=");
                 id=input.nextInt();
                System.out.print("Enter Product Name=");
                input.nextLine();
                name=input.nextLine();
                System.out.print("Enter Product Qty=");
                 qty=input.nextInt();
                System.out.print("Enter Price of Product=");
                 price=input.nextFloat();
                 time=LocalDate.now();
            j++;
        }public void lastpage()
        {
                int result=1;
                System.out.print("Page "+result);
                System.out.printf("%98s","Total recode=");
                System.out.print(j);
                System.out.println();
        }
        int result;
        public void page()
        {
                int totalResults =j;
                int pageSize = 2;

                if ((totalResults % pageSize) == 0) {
                        result = totalResults / pageSize;
                } else {
                        result =( totalResults / pageSize) + 1;
                }
                System.out.print("Page "+result);
                System.out.printf("%98s","Total recode=");
                System.out.print(j);
                System.out.println();
        }
        public void gotopage(List<Product> productList,int i)
        {
                CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
                Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
                // render menu
                List<String> TitleMenu = new ArrayList<>(List.of("ID",
                        "NAME", "QTY", "PRICE", "IMPORTED DATE"));
                table.setColumnWidth(0, 25, 30);
                table.setColumnWidth(1, 15, 25);
                table.setColumnWidth(2, 20, 25);
                table.setColumnWidth(3, 20, 25);
                table.setColumnWidth(4, 20, 25);
                for (String menu : TitleMenu) {
                        table.addCell(menu, cellStyle);
                }
                for (Product product : productList) {
                        if(i==result) {
                                table.addCell(product.getId() + "", cellStyle);
                                table.addCell(product.getName(), cellStyle);
                                table.addCell(product.getQty() + "", cellStyle);
                                table.addCell(product.getPrice() + "", cellStyle);
                                table.addCell(product.getTime() + "", cellStyle);
                        }

                }
                System.out.println(table.render());
        }



        public int getId() {
        return id;
        }

public void setId(int id) {
        this.id = id;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public int getQty() {
        return qty;
        }

public void setQty(int qty) {
        this.qty = qty;
        }

public float getPrice() {
        return price;
        }

public void setPrice(float price) {
        this.price = price;
        }

public LocalDate getTime() {
        return time;
        }

public void setTime(LocalDate time) {
        this.time = time;
        }
        }
