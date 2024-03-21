package ru.innopolis.thirdattestation.online_record.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;
import ru.innopolis.thirdattestation.online_record.models.Order;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long id;
    private String productName;
    private Integer price;

    public static OrderDto from(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .productName(order.getProductName())
                .price(order.getPrice())
                .build();
    }

    public static List<OrderDto> from(List<Order> orders) {
        return orders.stream().map(OrderDto::from).collect(Collectors.toList());
    }
}