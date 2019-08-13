import React from 'react';
import {Link} from 'react-router-dom';

const UserPage = (props) => {


  const favouriteComics = props.user.comics.map((comic, index) => {
    return (
      <li key={index} className="favorite-comic">
        <img src={comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
      </li>
    )
  })

  return (
    <div className="user-page">
      <h1>Hey, {props.user.alias}!</h1>
      <div className="user-choices">
        <Link to={'/comics'}><h1>Comics</h1></Link>
      </div>
      <div className="user-choices">
        <Link to={'/characters'}><h1>Characters</h1></Link>
      </div>
      <div className="user-choices">
        <Link to={'/publishers'}><h1>Publishers</h1></Link>
      </div>

      <ul className="favourites-list">
      {favouriteComics}
      </ul>

    </div>
  )

}

export default UserPage;
