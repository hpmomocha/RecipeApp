package com.hpe.recipeapp.domain.util

interface EntityMapper<Entity, DomainModel> {
    fun mapFromEntity(entity: Entity): DomainModel
    fun mapToEntity(model: DomainModel): Entity
}