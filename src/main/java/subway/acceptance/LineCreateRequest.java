package subway.acceptance;


import lombok.Getter;

@Getter
public class LineCreateRequest {

    private String name;

    private String color;

    private Long upStationId;

    private Long downStationId;

    private Long distance;

    public LineCreateRequest(String name, String color, Long upStationId, Long downStationId, Long distance) {
        this.name = name;
        this.color = color;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }
}
