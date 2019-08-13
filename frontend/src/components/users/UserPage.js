import React from 'react';
import {Link} from 'react-router-dom';

const UserPage = (props) => {
console.log(props);
console.log(props.user);

const userComics = props.user.comics

function comicList(userComics){

  if(userComics) {
    console.log(userComics);
      userComics.map((comic, index) => {
        console.log(comic.image);
      return (
        <li key={index} className="favourite-comic">
        <img src={comic.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" alt="Comic Cover"/>
        </li>
      )
      })
    } else {
        return <li className="favourite-comic">"You have no favourite comics yet!"</li>
      }

    }


  const handleDelete = () => {
    props.onDelete(props.user.id)
  }

  const editUrl = "/users/edit/" + props.user.id

  return (
    <div className="user-page">
      <h1>Hey, {props.user.alias}!</h1>
      <Link to={editUrl}><button type="button">Edit Your Profile</button></Link>
      <button onClick={handleDelete}>Delete Your Profile</button>
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
      <ul>
        {comicList(userComics)}
      </ul>
    </div>
  )

}



export default UserPage;
