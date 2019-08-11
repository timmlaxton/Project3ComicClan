import React from 'react';
import Comic from './Comic.js';

const ComicList = (props) => {

  console.log(props.comics);

  const comics = props.comics.map((comic, index) => {
    return (
      <li key={index} className="component-item">
        <div className="component">
          <Comic comic={comic} />
        </div>
      </li>
    )
  })

  return (
    <ul className="component-list">
      {comics}
    </ul>
  )

}

export default ComicList;
