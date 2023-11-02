import React, { useState } from "react";
const { Set, List } = require("immutable");

function Setdemo() {
  const set = Set([
    "ram",
    "ram",
    "kumar",
    "sachin",
    "sachin",
    "peter",
    "prijoy",
  ]);
  const list = List(set);
  const [name, setName] = useState();
  const [index, setIndex] = useState();

  const displayset = () => {
    // console.log(set.first());
    // console.log(set.last());
    set.forEach((x) => {
      console.log(x);
    });
  };
  const displaylist = () => {
    setName(list.get(index));
  };
  return (
    <div>
      <div>
        <form>
          <label>Index No:</label>
          <input
            type="text"
            onBlur={(e) => {
              setIndex(e.target.value);
            }}
          ></input>
        </form>
        <button type="button" onClick={displayset}>
          Set
        </button>
        <button type="button" onClick={displaylist}>
          List
        </button>
      </div>
      {name}
    </div>
  );
}

export default Setdemo;