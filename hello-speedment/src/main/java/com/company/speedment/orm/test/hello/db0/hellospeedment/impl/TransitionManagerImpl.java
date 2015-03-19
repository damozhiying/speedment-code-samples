package com.company.speedment.orm.test.hello.db0.hellospeedment.impl;

import com.company.speedment.orm.test.hello.db0.hellospeedment.Transition;
import com.company.speedment.orm.test.hello.db0.hellospeedment.TransitionBuilder;
import com.company.speedment.orm.test.hello.db0.hellospeedment.TransitionManager;
import com.speedment.orm.core.manager.AbstractManager;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.transition'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class TransitionManagerImpl extends AbstractManager<java.util.List<Integer>, Transition, TransitionBuilder> implements TransitionManager {
    
    @Override
    public TransitionBuilder builder() {
        return new TransitionImpl();
    }
    
    @Override
    public TransitionBuilder toBuilder(Transition prototype) {
        return new TransitionImpl(prototype);
    }
    
    @Override
    public Stream<Transition> stream() {
        return Stream.empty();
    }
    
    @Override
    public Transition persist(Transition entity) {
        return entity;
    }
    
    @Override
    public Transition remove(Transition entity) {
        return entity;
    }
}