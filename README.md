# 云竹交通扩展Mod

**[简体中文](./README_zh-cn.md)** | [English](./README.md)

**云竹交通扩展Mod**是 [Minecraft Transit Railway Mod](https://github.com/jonafanho/Minecraft-Transit-Railway)
的装饰性附加模组，提供精美的**电梯**与**地铁站**元素，以美化您的轨交建造。

<img src="http://image.yunzhu.host/i/2025/05/01/681363e498172.webp" style="width: 200px; height: auto;" />


---

## 功能特色

- 电梯装饰组件 (更多外呼、电梯门，到站灯，智能分配)
- 地铁站美化内容

---

## 安装说明

1. **克隆此仓库**
   ```bash
   git clone https://github.com/X-Funny/Yunzhu-Transit-Extension.git
   ```

2. **在您使用的 IDE 中同步 Gradle 项目**（如 IntelliJ IDEA）

3. **初次运行或切换 Minecraft 版本时：**
    - 同步 Gradle 项目
    - 在根项目中运行 `setupLibrary` Gradle 任务：
      ```bash
      ./gradlew setupLibrary
      ```  
    - 再次同步 Gradle 项目
---

## 许可协议

本项目采用 [MIT 协议](https://raw.githubusercontent.com/X-Funny/Yunzhu-Transit-Extension/main/LICENSE) 开源。

---

## 字体许可

| 字体名称                                     | 许可协议                                                |
|------------------------------------------|-----------------------------------------------------|
| ces-14x7                                 | Creative Commons Attribution License 3.0            |
| DSEG7 Classic Bold Italic                | SIL Open Font License 1.1                           |
| Hitachi Modern Regular                   | Creative Commons Attribution License 3.0            |
| Hitachi Dot Matrix Regular               | Creative Commons Attribution Non-Commercial License |
| Hitachi Dot Matrix Small Generic         | Creative Commons Attribution Non-Commercial License |
| Hitachi Dot Matrix Small PAFC            | Creative Commons Attribution Non-Commercial License |
| DSEG14 Classic Light Italic              | SIL Open Font License 1.1                           |
| KONE M-Series Regular                    | FontStruct Non-Commercial License                   |
| Mitsubishi Modern V2                     | Creative Commons Attribution License 3.0            |
| Schindler Led Regular                    | Creative Commons Attribution License 3.0            |
| Schindler M-Line LED Regular             | Creative Commons Attribution Share Alike License    |
| Schindler M-Series LOP (NZ Thin #1) BETA | Creative Commons Attribution Non-Commercial License |
| Tonic LED                                | Creative Commons Attribution License 3.0            |
| Tonic LED Small                          | Creative Commons Attribution License 3.0            |
| Nimbus Sans L                            | GNU General Public License Version 2+               |


---

# Yunzhu Transit Extension Mod

[简体中文](./README_zh-cn.md) | **[English](./README.md)**

**Yunzhu Transit Extension** is a decorative add-on for
the [Minecraft Transit Railway Mod](https://github.com/jonafanho/Minecraft-Transit-Railway), providing stylish **elevator** and **metro station** elements to enhance your transit builds.

<img src="http://image.yunzhu.host/i/2025/05/01/681363e498172.webp" style="width: 200px; height: auto;" />


---

## Features

- Elevator decorations (Enhanced Call Buttons, More Doors, Hall Lanterns and Destination Dispatch)
- Metro station enhancements

---

## Setup Instructions

1. **Clone this repository**
   ```bash
   git clone https://github.com/X-Funny/Yunzhu-Transit-Extension.git
   ```

2. **Sync the Gradle project** in your preferred IDE (e.g., IntelliJ IDEA)

3. **On first run or when switching Minecraft versions:**
    - Sync the Gradle project
    - In the root project, run the `setupLibrary` Gradle task:
      ```bash
      ./gradlew setupLibrary
      ```  
    - Sync the Gradle project again

---

## License

This project is licensed under
the [MIT License](https://raw.githubusercontent.com/X-Funny/Yunzhu-Transit-Extension/main/LICENSE).

---

## Font License

| Font Name                                | License                                             |
|------------------------------------------|-----------------------------------------------------|
| ces-14x7                                 | Creative Commons Attribution License 3.0            |
| DSEG7 Classic Bold Italic                | SIL Open Font License 1.1                           |
| Hitachi Modern Regular                   | Creative Commons Attribution License 3.0            |
| Hitachi Dot Matrix Regular               | Creative Commons Attribution Non-Commercial License |
| Hitachi Dot Matrix Small Generic         | Creative Commons Attribution Non-Commercial License |
| Hitachi Dot Matrix Small PAFC            | Creative Commons Attribution Non-Commercial License |
| DSEG14 Classic Light Italic              | SIL Open Font License 1.1                           |
| KONE M-Series Regular                    | FontStruct Non-Commercial License                   |
| Mitsubishi Modern V2                     | Creative Commons Attribution License 3.0            |
| Schindler Led Regular                    | Creative Commons Attribution License 3.0            |
| Schindler M-Line LED Regular             | Creative Commons Attribution Share Alike License    |
| Schindler M-Series LOP (NZ Thin #1) BETA | Creative Commons Attribution Non-Commercial License |
| Tonic LED                                | Creative Commons Attribution License 3.0            |
| Tonic LED Small                          | Creative Commons Attribution License 3.0            |
| Nimbus Sans L                            | GNU General Public License Version 2+               |

---

## RongMC · Minecraft 26.3 Fabric 移植说明

本仓库是 RongMC 维护的 **Minecraft 26.3 / Fabric / Java 25** 移植构建，不是上游官方发行渠道。

### 与原版的主要差异
- Minecraft 26.3 Fabric 移植；Fabric id `rongmc_yte`（provides `yte`）。
- 依赖 `rongmc_mtr`。上游标注 MIT；本发布仓见 `LICENSE`（GPL-3.0）。

### 已知问题 / 限制
- 电梯/站台装饰与 MTR 电梯系统联动；单独安装无核心模组时无法完整体验。
- 字体与贴图许可见表；请勿拆出资源单独再授权。

### 构建与安装
- Fabric mod id：`rongmc_yte`（`provides`：`yte`，旧依赖名一般仍可解析）
- Release 产物见本仓库 Releases（jar 名带 `rongmc-` 前缀）
- 许可证：本仓以 **GPL-3.0** 发布（见 `LICENSE`）；请同时尊重上游原作者条款与署名

