import React from 'react';
import Comic from './Comic.js';

const ComicList = (props) => {

  const comics = props.comics.map((comic, index) => {
    return (
      <li key={index} className="comic-item">
        <div>
          <Comic comic={comic} />
        </div>
      </li>
    )
  })

  return (
    <ul className="comic-list">
    {comics}
    </ul>
  )

}

export default ComicList;
