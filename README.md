# Yunzhu Transit Extension (YTE)

[简体中文](./README_zh-cn.md) · English

Adds lift doors, controls, floor displays and ticket barriers in several styles. The RongMC 26.3 port continues to use MTR lift routing and screen data.

## Download and installation

- Version · [v1.0.2-port.1+26.3](https://github.com/OpenRongMC/Yunzhu-Transit/releases/tag/v1.0.2-port.1%2B26.3) (Release)
- Release asset · `rongmc-yte-1.0.2-port.1.26.3.jar`
- Runtime · Minecraft Java 26.3, Fabric, Java 25
- Fabric Loader · `>=0.19.3`
- Fabric mod ID · `rongmc_yte`
- Dependencies declared by the JAR · [Fabric API](https://modrinth.com/mod/fabric-api), [`rongmc_mtr`](https://github.com/OpenRongMC/Minecraft-Transit-Railway) `4.0.5-port.1+26.3`

Place the release JAR in the instance’s `mods/` directory. Use matching MTR and YTE builds on both sides. Mod Menu provides a client configuration entry, and RongMC Transport UI provides the optional Oriel appearance.

## How to try it

Build a two-stop lift and check floor-editor saves, call buttons, door operation, boarding and cabin rendering while moving. Include the door type, track direction and whether the lift came from an old save.

## Development

Develop and test alongside the matching MTR and platform mappings. The RongMC transport build uses Java 25. Use the coordinated workspace and release metadata when reproducing a release.

## Documentation and support

- [Previous README (historical guide, contributors and credits)](https://github.com/OpenRongMC/Yunzhu-Transit/blob/69ce4910a83092c51ae2d871407feeac48278f9b/README.md)
- [Upstream project and documentation](https://github.com/Yunzhu-Dev/Yunzhu-Transit-Extension)
- [Report a RongMC port issue](https://github.com/OpenRongMC/Yunzhu-Transit/issues) · Include the game version, client and server JAR names, reproduction steps and relevant logs.

## License and credits

See this repository’s [LICENSE](./LICENSE) and the original project’s license, credits and third-party asset notices.
