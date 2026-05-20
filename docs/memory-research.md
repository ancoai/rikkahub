# RikkaHub 记忆机制研究笔记

- 全局记忆与跨对话记忆由 `memoryentity` 表持久化。
- 通过 `Assistant.enableMemory` 开关启用 memory tool。
- 通过 `Assistant.useGlobalMemory` 决定使用 `__global__` 命名空间或助手独立命名空间。
- `enableRecentChatsReference` 会把同一助手最近 10 条会话标题+时间注入 system prompt。
