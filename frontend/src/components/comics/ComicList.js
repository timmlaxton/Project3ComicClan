import React from 'react';
import Comic from './Comic.js';
import {Link} from 'react-router-dom';

const ComicList = (props) => {

  console.log(props.comics);


  const comics = props.comics.map((comic, index) => {
    const url = "/comics/" + comic.id

    return (
      <li key={index} className="component-item">
        <div className="component">
        <Link to={url} >
          <img src={comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" alt="Comic Cover"/>
        </Link>
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
