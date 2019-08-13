import React from 'react';
import {Link} from 'react-router-dom';

const UserPage = (props) => {


  // if(props.user.comics) {
  //   var favouriteComics = props.user.comics.map((comic, index) => {
  //     return (
  //       <li key={index} className="favorite-comic">
  //         <img src={comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
  //       </li>
  //       )
  //     })} else {
  //       var favouriteComics = "You have no favourite comics yet!"
  //       return <li>{favouriteComics}</li>
  //     }


  const handleDelete = () => {
    props.onDelete(props.user.id)
  }

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
      <h2>Favourite Comics:</h2>

      <button onClick={handleDelete}>Delete Your Profile</button>
    </div>
  )

}



export default UserPage;
