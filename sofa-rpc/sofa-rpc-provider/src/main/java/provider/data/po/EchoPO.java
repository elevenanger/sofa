package provider.data.po;

import lombok.Data;

import javax.persistence.*;

/**
 * author : liuanglin
 * date : 2022/7/4 18:56
 * description :
 */
@Entity
@Data
@Table(name = "echo_info")
public class EchoPO {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String info;
}
