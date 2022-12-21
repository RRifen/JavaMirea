package lab15.task02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MenuSelector extends JFrame {
    String[] menuItems = {"Australia", "China", "England", "Russia"};
    JComboBox<String> menu = new JComboBox<>(menuItems);
    MenuSelector() {
        super("Menu Selector");
        setLayout(new FlowLayout());
        add(menu);
        setSize(200, 200);
        setVisible(true);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String)((JComboBox)e.getSource()).getSelectedItem();
                String australiaInfo = "Австралия – это страна, занимающая одноименный материк, который омывается Индийским и Тихим океанами. На побережьях континента находятся такие крупные города, как Сидней, Брисбен, Мельбурн, Перт и Аделаида. Столица Австралии – Канберра – расположена вдали от моря. Главными достопримечательностями страны являются Сиднейский оперный театр, Большой Барьерный риф и аутбэк – обширная пустынная местность. Также интересна фауна Австралии: здесь обитают уникальные виды животных, например кенгуру и утконосы.";
                String chinaInfo = "Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км. Столица страны, Пекин, славится современной архитектурой и древними памятниками, среди которых дворцовый комплекс Запретный город и площадь Тяньаньмэнь. На востоке расположен мировой финансовый центр Шанхай, силуэт которого формируют бесчисленные небоскребы. По северному Китаю, пересекая его с востока на запад, проходит Великая Китайская стена.";
                String englandInfo = "Англия, родина Шекспира и группы The Beatles, входит в состав Соединенного Королевства Великобритании и Северной Ирландии. Она расположена на Британских островах и граничит с Шотландией и Уэльсом. Столица Англии Лондон – современный многонациональный город на реке Темзе, деловой и культурный центр страны. Он получил всемирную известность благодаря зданию Парламента, башне Биг-Бен и крепости Тауэр XI века. Другие крупные города Англии – Манчестер, Бирмингем, Ливерпуль и Бристоль, а также Оксфорд и Кембридж с их знаменитыми университетами.";
                String russiaInfo = "Росси́я, или Росси́йская Федера́ция (сокр. РФ), — государство в Восточной Европе и Северной Азии. Россия — крупнейшее государство в мире, её территория в конституционных границах с территорией Крыма, аннексия которого не получила международного признания, составляет 17 125 191[8] км²Перейти к разделу «#Географическое положение». Население страны в тех же границах составляет 147 182 123[12] чел. (2021; 9-е место в мире)Перейти к разделу «#Численность населения, расселение» Столица — Москва. Государственный язык на всей территории страны — русскийПерейти к разделу, в ряде регионов России также установлены свои государственные и официальные языки. Денежная единица — российский рубль.";

                if (selectedOption == "Australia") {
                    JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'>"+ australiaInfo +"</p></body></html>","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (selectedOption == "China") {
                    JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'>"+ chinaInfo +"</p></body></html>","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (selectedOption == "England") {
                    JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'>"+ englandInfo +"</p></body></html>","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (selectedOption == "Russia") {
                    JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'>"+ russiaInfo +"</p></body></html>","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Выберите страну из списка!","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new MenuSelector();
    }
}
