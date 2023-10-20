package utils;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.util.ArrayList;
import java.util.List;
import model.Product;
public class formatTable {
    public static void renderMenu() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);
        List<String> TitleMenu = new ArrayList<>(List.of("1.ALL",
                "2.NAME", "3.QTY", "4.PRICE", "5.BACK TO MENU"));
        table.setColumnWidth(0, 25, 30);
        table.setColumnWidth(1, 15, 25);
        table.setColumnWidth(2, 20, 25);
        table.setColumnWidth(3, 20, 25);
        table.setColumnWidth(4, 20, 25);
        for (String upmenu : TitleMenu) {
            table.addCell(upmenu, cellStyle);
        }
        System.out.println(table.render());
    }

    public static void renderProduct(List<Product> productList) {
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
            for(int i=0;i<productList.size();i++) {
                table.addCell(productList.get(i).getId()+ "", cellStyle);
                table.addCell(productList.get(i).getName(), cellStyle);
                table.addCell(productList.get(i).getQty()+ "", cellStyle);
                table.addCell(productList.get(i).getPrice()+ "", cellStyle);
                table.addCell(productList.get(i).getTime()+ "", cellStyle);
//                table.addCell(product.getName(i), cellStyle);
//                table.addCell(product.getQty() + "", cellStyle);
//                table.addCell(product.getPrice() + "", cellStyle);
//                table.addCell(product.getTime() + "", cellStyle);
            }


        System.out.println(table.render());
    }
    public static void Setrow(List<Product> productList,int n) {
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
        for(int i=0;i<n;i++) {
            table.addCell(productList.get(i).getId()+ "", cellStyle);
            table.addCell(productList.get(i).getName(), cellStyle);
            table.addCell(productList.get(i).getQty()+ "", cellStyle);
            table.addCell(productList.get(i).getPrice()+ "", cellStyle);
            table.addCell(productList.get(i).getTime()+ "", cellStyle);
//                table.addCell(product.getName(i), cellStyle);
//                table.addCell(product.getQty() + "", cellStyle);
//                table.addCell(product.getPrice() + "", cellStyle);
//                table.addCell(product.getTime() + "", cellStyle);
        }


        System.out.println(table.render());
    }

    public static void menul(List<Product> product) {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        List<String> Menu = new ArrayList<>(List.of("ID",
                "NAME", "QTY", "PRICE", "IMPORTED DATE"));
        table.setColumnWidth(0, 25, 30);
        table.setColumnWidth(1, 15, 25);
        table.setColumnWidth(2, 20, 25);
        table.setColumnWidth(3, 20, 25);
        table.setColumnWidth(4, 20, 25);
        for (String menu : Menu) {
            table.addCell(menu, cellStyle);
        }

        table.addCell("" + product.get(product.size() - 1).getId(), cellStyle);
        table.addCell(product.get(product.size() - 1).getName(), cellStyle);
        table.addCell("" + product.get(product.size() - 1).getQty(), cellStyle);
        table.addCell("" + product.get(product.size() - 1).getPrice(), cellStyle);
        table.addCell("" + product.get(product.size() - 1).getTime(), cellStyle);
        System.out.println(table.render());
    }

    public static void menuf(List<Product> product) {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        List<String> Menu = new ArrayList<>(List.of("ID",
                "NAME", "QTY", "PRICE", "IMPORTED DATE"));
        table.setColumnWidth(0, 25, 30);
        table.setColumnWidth(1, 15, 25);
        table.setColumnWidth(2, 20, 25);
        table.setColumnWidth(3, 20, 25);
        table.setColumnWidth(4, 20, 25);
        for (String menu : Menu) {
            table.addCell(menu, cellStyle);
        }
        table.addCell("" + product.get(0).getId(), cellStyle);
        table.addCell(product.get(0).getName(), cellStyle);
        table.addCell("" + product.get(0).getQty(), cellStyle);
        table.addCell("" + product.get(0).getPrice(), cellStyle);
        table.addCell("" + product.get(0).getTime(), cellStyle);
        System.out.println(table.render());
    }
}


