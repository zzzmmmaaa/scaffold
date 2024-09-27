package com.sleepy.adapter.repository.mysql;

import com.sleepy.adapter.repository.entity.BaseDO;
import com.sleepy.adapter.repository.mysql.reactiverepository.BaseReactiveRepository;
import com.sleepy.adapter.repository.trasfer.BaseTransfer;
import com.sleepy.domain.model.BaseModel;
import com.sleepy.domain.repositry.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class BaseRepositoryImpl<M extends BaseModel, D extends BaseDO, Tr extends BaseTransfer<D, M>, Brr extends BaseReactiveRepository<D>> implements BaseRepository<M> {

    @Autowired
    Tr transfer;

    @Autowired
    Brr brr;


    @Override
    public Mono<M> update(M m) {
        //ReactiveCrudRepository的save方法会根据传入的对象是否含有id来判断时新增数据还是更新数据
        return brr.save(transfer.toDO(m)).flatMap(d -> Mono.just(transfer.toModel(d)));
    }


    @Override
    public Mono<M> save(M m) {
        D d = transfer.toDO(m);
        //调用setAsNew方法 使得JPA认为这是的新对象
        return brr.save((D)d.setAsNew()).flatMap(ds -> Mono.just(transfer.toModel(ds)));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Mono<M> findById(String id) {
        Mono<D> byId = brr.findById(id);
        return byId.flatMap(b -> Mono.just(transfer.toModel(b)));
    }

}
