package org.stranger2015.hitalk.core.compiler.instructions;

public
interface Instruction {
    /** See the WAM tutorial for explanation on the execute functionality of each instruction. */
    void execute(PrologRuntime runtime);

}
