/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.commons.core.service;

import javax.ejb.Remote;
import com.webapp.commons.core.entities.LogEvent;

/**
 *
 * @author Ramses
 */
@Remote
public interface LogEventServiceBeanRemote extends GenericServiceBeanRemote<LogEvent, Long>{
    
}
