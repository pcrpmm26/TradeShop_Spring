package company.trade.tradshop.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
// import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("category")
@Getter @Setter @NoArgsConstructor
public class Category {

    // @Id
    // private String _id;

    // private String categoryId;

    private String categoryname ;

    @CreatedDate
    private Date createdAt;
    
}
