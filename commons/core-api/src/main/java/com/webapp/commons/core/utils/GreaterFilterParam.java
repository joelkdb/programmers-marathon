/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.commons.core.utils;

import javax.persistence.Query;

/**
 *
 * @author Persistence
 */
public class GreaterFilterParam extends FilterParam {

    protected GreaterFilterParam(String field, Object value) {
        super(field, value);
    }

    public static GreaterFilterParam from(String field, Object value) {
        return new GreaterFilterParam(field, value);
    }

    @Override
    public String queryChunk(String prefix) {
        if (this.isNotValid()) {
            return "";
        }

        return getQueryChunk(prefix);
    }

    @Override
    protected String getQueryChunk(String prefix) {
        return prefix + "." + this.field + " > :" + this.getFieldQueryParameter();
    }

    @Override
    public void setQueryParam(Query query) {
        if (this.isValid()) {
            query.setParameter(this.getFieldQueryParameter(), "%" + this.value + "%");
        }
    }
}
