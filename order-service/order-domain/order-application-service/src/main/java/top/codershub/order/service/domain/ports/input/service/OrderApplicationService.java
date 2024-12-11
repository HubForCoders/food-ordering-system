package top.codershub.order.service.domain.ports.input.service;

import top.codershub.order.service.domain.dto.create.CreateOrderCommand;
import top.codershub.order.service.domain.dto.create.CreateOrderResponse;
import top.codershub.order.service.domain.dto.track.TrackOrderQuery;
import top.codershub.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
