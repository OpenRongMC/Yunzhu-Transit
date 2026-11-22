# 云竹交通扩展（YTE）

简体中文 · [English](./README.md)

为 MTR 增加多个厂型的电梯门、按钮、层站显示器和闸机等设备。RongMC 26.3 端口继续使用 MTR 的电梯线路与界面数据。

## 下载与安装

- 版本 · [v1.0.2-port.1+26.3](https://github.com/OpenRongMC/Yunzhu-Transit/releases/tag/v1.0.2-port.1%2B26.3) (已发布)
- 下载文件 · `rongmc-yte-1.0.2-port.1.26.3.jar`
- 运行环境 · Minecraft Java 26.3, Fabric, Java 25
- Fabric Loader · `>=0.19.3`
- Fabric 模组 ID · `rongmc_yte`
- JAR 声明的依赖 · [Fabric API](https://modrinth.com/mod/fabric-api), [`rongmc_mtr`](https://github.com/OpenRongMC/Minecraft-Transit-Railway) `4.0.5-port.1+26.3`

把发行 JAR 放入对应实例的 `mods/` 目录。联机双端使用同系列 MTR 和 YTE。可在客户端通过 Mod Menu 找到配置入口。Oriel 外观切换由 RongMC Transport UI 提供。

## 如何验证

先用两个楼层建一部电梯，检查楼层编辑保存、呼梯、门开关、进出轿厢及移动时的显示。反馈问题时注明旧存档或新建电梯、门型与轨道方向。

## 开发

与同一版本的 MTR 和平台映射一起联调。交通套件的 RongMC 发布构建使用 Java 25，应以配套工作区和发行 JAR 的元数据为准。

## 文档与反馈

- [原 README（旧版指南、贡献者与署名）](https://github.com/OpenRongMC/Yunzhu-Transit/blob/69ce4910a83092c51ae2d871407feeac48278f9b/README_zh-cn.md)
- [上游项目与文档](https://github.com/Yunzhu-Dev/Yunzhu-Transit-Extension)
- [报告 RongMC 移植问题](https://github.com/OpenRongMC/Yunzhu-Transit/issues) · 请附游戏版本、两端 JAR 文件名、复现步骤和相关日志。

## 许可与署名

请参阅本仓库的 [LICENSE](./LICENSE) 及原项目的许可、署名和第三方资源说明。
