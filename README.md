
## What this mod does?
Broken Mirror allows you to make fixed (non-mirrored) shaped recipes by simply setting recipe type as _"brokenmirror:shaped_fixed"_. This means that your shaped recipe won't match the mirrored pattern like vanilla "minecraft:crafting_shaped" does.

---
For example, you can have two different symmetrical shaped recipes that won't overlap each other:

**_data/[your_namespace]/recipe/example1.json_**

```json
{
  "type": "brokenmirror:shaped_fixed",
  "category": "equipment",
  "key": {
    "#": {
      "tag": "c:rods/wooden"
    },
    "X": {
      "tag": "minecraft:planks"
    }
  },
  "pattern": [
    "XX",
    "X#"
  ],
  "result": {
    "count": 1,
    "id": "minecraft:wooden_axe"
  }
}
```

**_data/[your_namespace]/recipe/example2.json_**

```json
{
  "type": "brokenmirror:shaped_fixed",
  "category": "equipment",
  "key": {
    "#": {
      "tag": "c:rods/wooden"
    },
    "X": {
      "tag": "minecraft:planks"
    }
  },
  "pattern": [
    "XX",
    "#X"
  ],
  "result": {
    "count": 1,
    "id": "minecraft:wooden_pickaxe"
  }
}
```
![example1.json](https://cdn.modrinth.com/data/cached_images/fade17bb085197a4d0f9a772f51d49a162d3b9e1.png)
![example2.json](https://cdn.modrinth.com/data/cached_images/43d3d8112a7fed5ddb9ff0c1dff26ea69055717e.png)

<details>
<summary>CREDITS</summary>

Some of the code whas taken and adapted from [Choonster's repository](https://github.com/Choonster-Minecraft-Mods/TestMod3/tree/1.21.x/src/main/java/choonster/testmod3/world/item/crafting/recipe).

</details>
