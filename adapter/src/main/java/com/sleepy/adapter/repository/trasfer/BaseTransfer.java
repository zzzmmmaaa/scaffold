package com.sleepy.adapter.repository.trasfer;

import com.sleepy.adapter.repository.entity.BaseDO;
import com.sleepy.domain.model.BaseModel;

import java.util.List;

    public interface BaseTransfer<D extends BaseDO, M extends BaseModel> {

        /**
         * DTO转Entity
         *
         * @param dto 模型
         * @return 数据库对象
         */
        D toDO(M dto);

        /**
         * Entity转DTO
         *
         * @param entity 数据库对象
         * @return 模型
         */
        M toModel(D entity);

        /**
         * DTO集合转Entity集合
         *
         * @param dtoList 模型
         * @return
         */
        List<D> toDO(List<M> dtoList);

        /**
         * Entity集合转DTO集合
         *
         * @param entityList 数据库对象
         * @return 模型
         */
        List<M> toModel(List<D> entityList);

}
