package com.niuzj.pattern;

/**
 * 命令接口
 */
public interface Command {
    void execute();

    void undo();

    void redo();
}
