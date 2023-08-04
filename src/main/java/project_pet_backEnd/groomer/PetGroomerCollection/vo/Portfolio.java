package project_pet_backEnd.groomer.PetGroomerCollection.vo;

import lombok.Data;

@Data
public class Portfolio {
    private Integer porId;
    private Integer pgId;
    private String porTitle;
    private String porText;
    private java.util.Date porUpload;//util.date

    // 此處省略建構子、Getter 和 Setter 方法
}